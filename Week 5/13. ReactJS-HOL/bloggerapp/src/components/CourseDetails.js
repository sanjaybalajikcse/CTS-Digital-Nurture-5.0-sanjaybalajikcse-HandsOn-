import React from 'react';

function CourseDetails(props) {
  // Technique 2: if/else with a function returning JSX
  function renderDate(date) {
    if (date) {
      return <h4>{date}</h4>;
    } else {
      return <h4>Date not available</h4>;
    }
  }

  const coursedet = (
    <ul>
      {props.courses.map((course) => (
        <div key={course.id}>
          <h3>{course.cname}</h3>
          {/* Technique 3: ternary operator, inline */}
          {course.date ? <h4>{course.date}</h4> : <h4>TBD</h4>}
          {/* or call the if/else function above */}
          {renderDate(course.date)}
        </div>
      ))}
    </ul>
  );

  return (
    <div className="mystyle1">
      <h1>Course Details</h1>
      {coursedet}
    </div>
  );
}

export default CourseDetails;