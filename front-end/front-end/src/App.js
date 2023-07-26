
import './App.css';
import rasd_parameters from './Parameters.js'
import {useState} from 'react';



function App() {
  const [inputs,setInputs]=useState(rasd_parameters);

  

  const handleClick=()=>{
    const username = 'ricardo1';
    const password = '12345';
    const authHeader = 'Basic '+btoa(username + ':' + password);
    console.log(authHeader);
        
    const item=inputs.map((element)=>{
      const id=element.parameter_id;
      const nameParameter=element.parameter_name;
      const valueParameter=element.parameter_value;
      const dataToBackEnd={
        id:id,
        nameParameter:nameParameter,
        valueParameter:valueParameter
        
      };
      console.log(dataToBackEnd);
      fetch("http://localhost:8080",{method:'POST',headers:{'Content-Type':'application/json','Authorization':authHeader},body: JSON.stringify(dataToBackEnd),redirect:'follow'});
      //fetch("http://localhost:8080",{method: 'POST',headers: myHeaders,body: JSON.stringify(dataToBackEnd),redirect:'follow'});

  }
    )
}

 
  
  const handleChange=(identifier,value_received)=>{
    const updateFields=inputs.map((field)=>field.parameter_id===identifier?{...field,parameter_value:value_received}:field);
    setInputs(updateFields);

    };

  return (
    <>
    <h1>RASD PROJECT</h1>
    <h2>
      Parameters
    </h2>
    {inputs.map((element)=>(
    <ul>
      <li>
        <label htmlFor={element.parameter_id}>{element.parameter_name}</label>
        <input
        id={element.parameter_id}
        key={element.parameter_id}
        type="text"
        value={element.parameter_value}
        onChange={(e)=>handleChange(element.parameter_id,e.target.value)}
        />
      </li>
    </ul>)
    )}
    
    <button onClick={handleClick}>Submit parameters</button>
   
    </>
    
    );

}
export default App;