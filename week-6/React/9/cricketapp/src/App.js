import "./App.css";

import {
  ListofPlayers,
  ScoreBelow70
} from "./ListofPlayers";

import {
  OddPlayers,
  EvenPlayers,
  ListofIndianPlayers,
  IndianPlayers,
  IndianTeam
} from "./IndianPlayers";

function App() {

  var flag = false;

  if (flag === true) {

    return (

      <div>

        <h1>List of Players</h1>

        <ListofPlayers />

        <hr />

        <h1>List of Players having Scores Less than 70</h1>

        <ScoreBelow70 />

      </div>

    );

  }

  else {

    return (

      <div>

        <h1>Indian Team</h1>

        <h2>Odd Players</h2>

        {OddPlayers(IndianTeam)}

        <hr />

        <h2>Even Players</h2>

        {EvenPlayers(IndianTeam)}

        <hr />

        <h2>List of Indian Players Merged</h2>

        <ListofIndianPlayers IndianPlayers={IndianPlayers} />

      </div>

    );

  }

}

export default App;