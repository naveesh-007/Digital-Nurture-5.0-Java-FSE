import React, { useState } from "react";

function CurrencyConvertor() {

  const [rupees, setRupees] = useState("");
  const [euro, setEuro] = useState(null);

  function handleSubmit(e) {
    e.preventDefault();

    const convertedAmount = (rupees / 90).toFixed(2);

    setEuro(convertedAmount);

    alert("Converting to Euro Amount is " + convertedAmount);
  }

  return (
    <div
      style={{
        width: "350px",
        padding: "20px",
        border: "1px solid #ccc",
        borderRadius: "10px",
        marginTop: "30px",
        boxShadow: "0 2px 8px rgba(0,0,0,0.2)"
      }}
    >
      <h1 style={{ color: "green", textAlign: "center" }}>
        Currency Convertor
      </h1>

      <form onSubmit={handleSubmit}>

        <label><b>Amount (INR)</b></label>
        <br />

        <input
          type="number"
          placeholder="Enter Rupees"
          value={rupees}
          onChange={(e) => setRupees(e.target.value)}
          style={{
            width: "100%",
            padding: "8px",
            margin: "10px 0"
          }}
        />

        <button
          type="submit"
          style={{
            width: "100%",
            padding: "10px",
            backgroundColor: "green",
            color: "white",
            border: "none",
            cursor: "pointer",
            borderRadius: "5px"
          }}
        >
          Convert
        </button>

        {euro !== null && (
          <>
            <br />
            <br />

            <label><b>Currency (Euro)</b></label>

            <input
              type="text"
              value={euro}
              readOnly
              style={{
                width: "100%",
                padding: "8px",
                marginTop: "10px"
              }}
            />
          </>
        )}

      </form>
    </div>
  );
}

export default CurrencyConvertor;