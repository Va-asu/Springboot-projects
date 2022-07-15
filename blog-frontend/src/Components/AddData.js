import axios from "axios";
import { useEffect, useState } from "react";
import { Link, useNavigate, useParams } from "react-router-dom";
import url from "../Services/service"
import 'bootstrap/dist/css/bootstrap.min.css';

const Add = () => {


    //to get the input from user 
    const [title,setTitle]=useState("");
    const [content,setContent]=useState("");

    const {id}=useParams();


    //to get what route previously we are on 
    const history=useNavigate();

    const saveData=(e)=>{
        e.preventDefault();

        const Data={title,content,id};

        //if id is there then update otherwise create the BlogData

        /** we can also create two different route for updating and adding the element **/
         if(id)
         {
            //using this if we have id of the Blogdata then we will update 
                axios.put(url+"update",Data
                )
                .then(response=>{
                   console.log("information updated "+response.data)
                   history("/")
                }).catch(error=> {console.log("something went wrong  hello  "+ error);})
               
         }else{
              //posting on perticular API the Data and simultaniously returning to homepage 
              //using history 
              axios.post(url+"add",Data
              )
             .then(function(response) {
              console.log(response)
              history("/")
              }).then(function(body) {
              console.log(body);
              });
         }
       

    }


    //to get the data of object with id on update form 
    useEffect(()=>{
        if(id)
        {
            axios.get(url+"blog/"+id).then((response)=>{
                setTitle(response.data.title);
                setContent(response.data.content);
            }).catch(e=>{
                console.log("something went wrong "+e);
            })
        }
    },[])


    return ( 
        <div className="container">
            <hr/>
            <h3>Add new Blog Data </h3>
            <hr/>

            <form>
                <div className="form-group my-2">
                    <input
                       type="text"
                       id="title"
                       className="form-control col-4"
                       value={title}
                       placeholder="Title"
                       onChange={e=>setTitle(e.target.value)}
                     />
                </div>
                <div className="form-group my-2">
                       <input
                       type="text"
                       id="content"
                       className="form-control col-4"
                       value={content}
                       placeholder="content"
                       onChange={e=>setContent(e.target.value)}
                     />
                </div>

                <div>
                    <button className="btn btn-primary mb-2 " onClick={e=>saveData(e)}>save</button>
                </div>
               
            </form>
            <div>
                <Link to={"/"}>Back to List</Link>
            </div>
            
        </div>
     );
}
 
export default Add;