import { useState } from "react";
import "./Items.css";
import ItemEl from "./ItemEl";
const Items = (props) => {
    const initName = props.name;
    const [name, setName] = useState(props.name);
    const [count, setCount] = useState(0);
    function clickHandler(){
        setCount(1);
        if (count == 1) {
          setName("변경");
          setCount(0);
        } else {
          setName(initName);
        }  
    }
    
    return (      
        <li className="items">
            <img src={props.thumb} alt={props.name} />
            <ItemEl title="이름" content={props.name} />
            <ItemEl title="이메일" content={props.email} />  
        </li>
    );
};
export default Items;