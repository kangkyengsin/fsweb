import { useState } from "react";
import "./ListForm.css";
import Heading from "../ui/Heading";
const ListForm = (props) => {
    console.log("ListForm", props);
    const [inputName, setInputName] = useState("");
    const [inputThumb, setInputThumb] = useState("");
    const [inputEmail, setInputEmail] = useState("");
    const submitHandler = (e) => {
        e.preventDefault();
        const newDB = { name: inputName, thumb: inputThumb, email: inputEmail };
        props.addDB(newDB);
        setInputName("");
        setInputThumb("");
        setInputEmail("");
    };



    return (
        <>
            <div className="listform">
                <Heading content="등록하기" />

                <form onSubmit={submitHandler}>
                    <div className="input_group">
                        <label htmlFor="uName">이름</label>
                        <input
                            type="text"
                            name="uName"
                            id="uName"
                            onChange={(e) => setInputName(e.target.value)}
                            value={inputName}
                        />
                    </div>
                    <div className="input_group">
                        <label htmlFor="uThumb">사진</label>
                        <input
                            type="text"
                            name="uThumb"
                            id="uThumb"
                            onChange={(e) => setInputThumb(e.target.value)}
                            value={inputThumb}
                        />
                    </div>
                    <div className="input_group">
                        <label htmlFor="uEmail">이메일</label>
                        <input
                            type="text"
                            name="uEmail"
                            id="uEmail"
                            onChange={(e) => setInputEmail(e.target.value)}
                            value={inputEmail}
                        />
                    </div>
                    <div className="input_group">
                        <button type="submit">전송</button>
                    </div>
                </form>
            </div>
        </>
    );

};
export default ListForm;