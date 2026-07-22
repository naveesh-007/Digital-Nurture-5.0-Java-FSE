import React, { useState } from "react";
import "./App.css";

import Greeting from "./Greeting";
import LoginButton from "./LoginButton";
import LogoutButton from "./LogoutButton";

function App() {

  const [isLoggedIn, setIsLoggedIn] = useState(false);

  function handleLogin() {
    setIsLoggedIn(true);
  }

  function handleLogout() {
    setIsLoggedIn(false);
  }

  return (

    <div style={{ margin: "40px" }}>

      <Greeting isLoggedIn={isLoggedIn} />

      <br />

      {
        isLoggedIn ?

          <LogoutButton onClick={handleLogout} />

          :

          <LoginButton onClick={handleLogin} />

      }

    </div>

  );

}

export default App;