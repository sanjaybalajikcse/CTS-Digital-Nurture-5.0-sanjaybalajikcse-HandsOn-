import React from 'react';
import './App.css';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';
import { books } from './data/books';
import { blogs } from './data/blogs';
import { courses } from './data/courses';

function App() {
  // Technique 4: switch-case conditional rendering (element variable)
  let status = 'loaded'; // try changing to 'loading' or 'error'
  let statusMessage;
  switch (status) {
    case 'loading':
      statusMessage = <p>Loading data...</p>;
      break;
    case 'error':
      statusMessage = <p>Something went wrong.</p>;
      break;
    default:
      statusMessage = null;
  }

  return (
    <div>
      <div>{statusMessage}</div>
      <div className="st2">
        <BookDetails books={books} />
      </div>
      <div className="v1">
        <BlogDetails blogs={blogs} />
      </div>
      <div className="mystyle1">
        <CourseDetails courses={courses} />
      </div>
    </div>
  );
}

export default App;