import Layout from "./components/layout/Layout";
import Lists from "./components/listViews/Lists";
import { useState } from "react";

const MemberDB = [
  { id: 'm1', name: '김경아', thumb: 'http://qwerew.cafe24.com/images/pet-1.jpg', email: 'abc@defg.com' },
  { id: 'm2', name: '김망고', thumb: 'http://qwerew.cafe24.com/images/pet-2.jpg', email: 'efg@defg.com' },
  { id: 'm3', name: '김민정', thumb: 'http://qwerew.cafe24.com/images/pet-3.jpg', email: 'hij@defg.com' },
  { id: 'm4', name: '윤현선', thumb: 'http://qwerew.cafe24.com/images/pet-4.jpg', email: 'lmn@defg.com' },
  { id: 'm5', name: '이소정', thumb: 'http://qwerew.cafe24.com/images/pet-5.jpg', email: 'opq@defg.com' },

];

function App() {
  const [addList, setAddList] = useState(MemberDB);
  const addListHandler = (db) => {
    setAddList((prev) => {
      console.log(prev);
      return [db, ...prev];
    });
  };
  return (
    <div className="App">
      <Lists db={addList} newList={addListHandler} />
    </div>
  );
}
export default App;
