import React from 'react';


function renderStars(n) {
    let arr = [];
    for (let i = 0; i < n; i++)
        arr.push(<i key={i} className="fa fa-star" style={{ color: 'orange' }}></i>)
    return arr;
}

function Review(props) {
    let { value: review } = props;
    return (
        <div className="alert alert-danger">
            {renderStars(review.stars)} &mdash; {review.author}
            <hr />
            <div>{review.body}</div>
        </div>
    );
}

export default Review;