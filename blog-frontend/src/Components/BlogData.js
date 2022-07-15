import React,{useState,useEffect} from "react";
import 'bootstrap/dist/css/bootstrap.min.css';
import url from "../Services/service"
import axios from "axios";
import { Link } from "react-router-dom";




let num=0;
function BlogData() {

   const [blogData,setData] =useState([]);

   useEffect(()=>{
       showList();
   },[]);


   //to delete the item with some id 
   const handleDelete=(id)=>{
       axios.delete(url+"delete/"+id).then(response=>{
           console.log("list item deleted ");
           showList();
       })
   }

   function showList(){
    axios.get(url+"blog").then(response=>{
        num++;
        console.log("setting the data "+num);
        setData(response.data);
      }).catch(error=> {console.log("something went wrong  hello  "+ error);})
   }

  return (
         <div>
                  <h1 className = "text-center"> Users List</h1>

                 <Link to={"/add"} className="btn btn-primary mb-2">Add Data</Link>

                  <table className = "table table-striped">
                      <thead>
                          <tr>
                              <td> Id</td>
                              <td> Title</td>
                              <td> Content</td>
                              <td>Actions</td>
                          </tr>
                      </thead>
                      <tbody>
                          {
                              blogData.map(
                                  entry =>
                                  <tr key={entry.id}>
                                       <td> {entry.id}</td>
                                       <td> {entry.title}</td>
                                       <td> {entry.content}</td>
                                       <td>
                                        <Link className="btn btn-info" to={`/update/${entry.id}`}>update</Link>
                                        <button className="btn btn-danger mx-3" onClick={e=>handleDelete(entry.id)}>Delete</button>
                                       </td>
                                  </tr>
                              )
                          }
                      </tbody>
                  </table>
              </div>
   
  );
}

export default BlogData;
