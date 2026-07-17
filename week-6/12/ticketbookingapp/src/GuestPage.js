import React from "react";

function GuestPage() {
  return (
    <div>
      <h2>Flight Details</h2>

      <table border="1" cellPadding="10">
        <thead>
          <tr>
            <th>Flight</th>
            <th>From</th>
            <th>To</th>
            <th>Price</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>AI101</td>
            <td>Hyderabad</td>
            <td>Delhi</td>
            <td>₹5000</td>
          </tr>

          <tr>
            <td>6E205</td>
            <td>Chennai</td>
            <td>Mumbai</td>
            <td>₹4200</td>
          </tr>
        </tbody>
      </table>

      <p>
        <b>Login to book your tickets.</b>
      </p>
    </div>
  );
}

export default GuestPage;