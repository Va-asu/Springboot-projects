import React from "react";
import {BrowserRouter,Route,Routes} from "react-router-dom"
import 'bootstrap/dist/css/bootstrap.min.css';
import BlogData from "./Components/BlogData";
import NoFound from "./Components/NoFound";
import AddData from "./Components/AddData"

function App() {
  return(
    <div>
    <BrowserRouter>
      <Routes>
        <Route exact path="/" element={<BlogData/>}/>
        <Route exact path="/add" element={<AddData/>}/>
        <Route exact path="/update/:id" element={<AddData/>}/>
        <Route path="*" element={<NoFound/>}/>
      </Routes>
    </BrowserRouter>     
    </div>
  )

  
}

export default App;
