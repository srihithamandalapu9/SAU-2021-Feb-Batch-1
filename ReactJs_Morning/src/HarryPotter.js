import React from 'react';
//import {style} from './style';
const book_details_style = {

    width:"600px",
    height:"500px",
    backgroundColor : "aliceblue",
    boxSizing: "border-box",
    padding:"70px",
    margin:"3%",
    border:"10px",
    
    }
function HarryPotter(){
    return (
        <div >
            <div style = {book_details_style} >
               <h1>HarryPotter </h1> 
               <hr size="10"></hr>
               <h3>Author - J.K.Rowling</h3><br></br>
               <h3>Language - English</h3><br></br>
               <h3>Number of Books - 7</h3>
            </div>
            
        </div>
    )
}

export default HarryPotter