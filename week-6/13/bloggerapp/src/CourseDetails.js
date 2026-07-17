import React from "react";

function CourseDetails({ courses }) {

  return (

    <div>

      <h1>Course Details</h1>

      {courses.map(course => (

        <div key={course.id}>

          <h2>{course.cname}</h2>

          <p>{course.date}</p>

        </div>

      ))}

    </div>

  );

}

export default CourseDetails;