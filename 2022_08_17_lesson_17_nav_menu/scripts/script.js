const nav_menu_btn = document.querySelector('.nav_menu_button');
const nav_menu = document.querySelector('.nav_menu');
const popup = document.querySelector('.popup');
const account = document.querySelector('.account');
const cross = document.querySelector('.form_cross');

nav_menu_btn.addEventListener('click', () => {
nav_menu.classList.toggle('active');
});

account.addEventListener('click', () => {
    popup.classList.add('popup_visible');
});

cross.addEventListener('click', () => {
    popup.classList.remove('popup_visible');
});

