import React from 'react'

const book_details_style = {

    width:"600px",
    height:"500px",
    backgroundColor : "aliceblue",
    boxSizing: "border-box",
    padding:"70px",
    margin:"3%",
    border:"10px",
    
    }
function Revolution2020(){
    return (
        <div >
            <div style = {book_details_style} >
               <h1>Revolution2020 </h1> 
               <hr size="10"></hr>
               <h3>Author - Chetan Bhagat</h3><br></br>
               <h3>Language - English</h3><br></br>
               <h3>Number of Books - 1</h3>
            </div>
            
        </div>
    )
}


export default Revolution2020
