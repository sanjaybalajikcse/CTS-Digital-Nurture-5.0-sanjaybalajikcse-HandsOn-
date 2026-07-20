import React from 'react';
import Post from './Post';

class Posts extends React.Component {
    constructor(props){
        super(props);
        // Step 5: initialize state with an empty list of Post objects
        this.state = {
            posts: []
        };
    }

    // Step 6: fetch posts and store them in state
    loadPosts() {
        fetch('https://jsonplaceholder.typicode.com/posts')
            .then(response => response.json())
            .then(data => {
                const posts = data.map(item => new Post(item.id, item.title, item.body));
                this.setState({ posts: posts });
            })
            .catch(error => {
                console.log(error);
            });
    }

    // Step 7: call loadPosts() once the component mounts
    componentDidMount() {
        this.loadPosts();
    }

    // Step 8: display title (heading) and body (paragraph) for each post
    render() {
        return (
            <div>
                {this.state.posts.map(post => (
                    <div key={post.id}>
                        <h2>{post.title}</h2>
                        <p>{post.body}</p>
                    </div>
                ))}
            </div>
        );
    }

    // Step 9: catch rendering errors and show them as an alert
    componentDidCatch(error, info) {
        alert("An error occurred: " + error.toString());
    }
}

export default Posts;