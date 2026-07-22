import React from "react";

const players = [
  { name: "Virat Kohli", score: 100 },
  { name: "Rohit Sharma", score: 98 },
  { name: "MS Dhoni", score: 95 },
  { name: "Sachin Tendulkar", score: 97 },
  { name: "Jasprit Bumrah", score: 88 },
  { name: "Hardik Pandya", score: 84 },
  { name: "Ravindra Jadeja", score: 76 },
  { name: "AB de Villiers", score: 69 },
  { name: "Steve Smith", score: 65 },
  { name: "Kane Williamson", score: 60 },
  { name: "Joe Root", score: 55 }
];

export function ListofPlayers() {
  return (
    <div>
      {players.map((item, index) => (
        <li key={index}>
          Mr. {item.name} {item.score}
        </li>
      ))}
    </div>
  );
}

export function ScoreBelow70() {
  const players70 = players.filter(player => player.score <= 70);

  return (
    <div>
      {players70.map((item, index) => (
        <li key={index}>
          Mr. {item.name} {item.score}
        </li>
      ))}
    </div>
  );
}