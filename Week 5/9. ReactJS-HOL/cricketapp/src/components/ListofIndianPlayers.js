export function ListofIndianPlayers({ IndianPlayers }) {
  return (
    IndianPlayers.map((item, index) => (
      <li key={index}>Mr. {item}</li>
    ))
  )
}