import React, { useState } from "react";

function Counter() {

  const [count, setCount] = useState(0);

  function increment() {
    setCount(count + 1);
  }

  function decrement() {
    setCount(count - 1);
  }

  function sayHello() {
    alert("Hello! Member");
  }

  function handleIncrement() {
    increment();
    sayHello();
  }

  function sayWelcome(message) {
    alert(message);
  }

  function onPress() {
    alert("I was clicked");
  }

  return (
    <div>

      <h2>{count}</h2>

      <button onClick={handleIncrement}>
        Increment
      </button>

      <br /><br />

      <button onClick={decrement}>
        Decrement
      </button>

      <br /><br />

      <button
        onClick={() => sayWelcome("Welcome")}
      >
        Say Welcome
      </button>

      <br /><br />

      <button onClick={onPress}>
        Click on me
      </button>

    </div>
  );
}

export default Counter;