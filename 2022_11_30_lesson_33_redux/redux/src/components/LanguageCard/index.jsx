import React from 'react'

export default function LanguageCard({ id, eng, rus, removeCard, lang, change }) {

  const text = lang === 'rus' ? rus : eng;

  return (
    <div onDoubleClick={() => removeCard(id)} onClick={() => change(id)}>
      {text}
    </div>
  )
}
