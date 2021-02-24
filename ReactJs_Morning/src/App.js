import { Component } from 'react';
import { 
	BrowserRouter as Router, 
	Route, 
	Link, 
	Switch, 
  BrowserRouter
} from 'react-router-dom'; 


class App extends Component {
  
  
  state = {
    listofbooks: ["HarryPotter","Secret","Revolution2020","EatTheFrog","EverybodyLies"],
    searchword:''
  }
  

  
  search = (event)=>{
    let key = event.target.value;
     
    this.setState({searchword:key})
  }


  render(){

    const mystyle = {
    
      padding:"15px",
      margin:"10",
      border:"10"
    }
     
    const body= {
      padding:"75px",
      margin:"10",
      border:"10",
      
      
      
    }
  const filtered_books = this.state.listofbooks.filter((data)=>{
    if(this.state.searchword == null){
      return data
    }
      else if(data.toLowerCase().includes(this.state.searchword.toLowerCase())){
        return data
      }
    }).map(data =>{
        return (
          <div style={mystyle}>
      
      <Link to ={`/${data}`}>{data} book</Link>
      
        
      
          </div>
        )

      })
      

  

  
  return (
    <div style = {body}>
      <h3>Welcome to Book Store !</h3>
      

      <input type = "text" onChange = {(e) => this.search(e)}></input>
      {filtered_books}
      
    </div>
  );
  
}
}
//ReactDOM.render(<BrowserRouter><App></App></BrowserRouter>,document.getElementById('root'));
export default App;
