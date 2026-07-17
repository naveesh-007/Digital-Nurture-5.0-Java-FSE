import "./App.css";

function App() {

  const offices = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai",
      Image: "/office1.png"
    },
    {
      Name: "WeWork",
      Rent: 75000,
      Address: "Hyderabad",
      Image: "/office2.png"
    },
    {
      Name: "Regus",
      Rent: 45000,
      Address: "Bangalore",
      Image: "/office3.png"
    }
  ];

return (
  <div style={{ margin: "20px" }}>

    <h1>Office Space, at Affordable Range</h1>

    <div
      style={{
        display: "flex",
        justifyContent: "space-around",
        flexWrap: "wrap",
        gap: "20px"
      }}
    >

      {offices.map((office, index) => (

        <div
          key={index}
          style={{
            border: "1px solid gray",
            padding: "15px",
            width: "280px",
            textAlign: "center",
            borderRadius: "10px"
          }}
        >

          <img
            src={office.Image}
            alt={office.Name}
            width="250"
            height="200"
          />

          <h2>{office.Name}</h2>

          <h3
            style={{
              color: office.Rent < 60000 ? "red" : "green"
            }}
          >
            Rent: Rs. {office.Rent}
          </h3>

          <h3>{office.Address}</h3>

        </div>

      ))}

    </div>

  </div>
);
}

export default App;