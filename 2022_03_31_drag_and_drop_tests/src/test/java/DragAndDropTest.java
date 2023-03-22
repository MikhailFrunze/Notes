public class DragAndDropTest {
    @Test
    public void draganddrop() {
        assertThat(driver.findElement(By.id("column-a")).getText(), is("A"));
        {
            WebElement dragged = driver.findElement(By.id("column-a"));
            WebElement dropped = driver.findElement(By.id("column-b"));
            Actions builder = new Actions(driver);
            builder.dragAndDrop(dragged, dropped).perform();
        }
        assertThat(driver.findElement(By.id("column-a")).getText(), is("B"));
    }
}

}
