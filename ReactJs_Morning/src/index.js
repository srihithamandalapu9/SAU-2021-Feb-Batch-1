import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';
import 'bootstrap/dist/css/bootstrap.css'
import { BrowserRouter, Route, Switch } from 'react-router-dom';
import HarryPotter from './HarryPotter';
import Secret from './Secret';
import EverybodyLies from './EverybodyLies';
import Revolution2020 from './Revolution2020';
import EatTheFrog from './EatTheFrog';



ReactDOM.render(<BrowserRouter>

<Route exact path = "/" component={App}></Route>
<Route path = "/Secret" component = {Secret} ></Route>
<Route path = "/HarryPotter" component = {HarryPotter} ></Route>
<Route path = "/EatTheFrog" component = {EatTheFrog} ></Route>
<Route path = "/EverybodyLies" component = {EverybodyLies} ></Route>
<Route path = "/Revolution2020" component = {Revolution2020} ></Route>
</BrowserRouter>,document.getElementById('root'));