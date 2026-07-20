import React from 'react';

function BlogDetails(props) {
  const content = (
    <ul>
      {props.blogs.map((blog) => (
        <div key={blog.id}>
          <h3>{blog.title}</h3>
          <h4>{blog.author}</h4>
          {/* Conditional rendering technique 1: && operator */}
          {blog.content && <p>{blog.content}</p>}
        </div>
      ))}
    </ul>
  );

  return (
    <div className="v1">
      <h1>Blog Details</h1>
      {content}
    </div>
  );
}

export default BlogDetails;