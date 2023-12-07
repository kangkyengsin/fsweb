import "./Lists.css";
import Items from "./Items";
import Row from "../ui/Row";
import Heading from "../ui/Heading";
import ListForm from "../listForm/ListForm";

const Lists = (props) => {
  const addDBHandler = (db) => {
    let id = Math.random().toString(36).substring(2, 5);
    const newdb = { ...db, id };
    console.log("Lists", newdb);
    props.newList(newdb);
  };

  return (
    <>
      <ListForm addDB={addDBHandler} />
      <Row className="list">
        {props.db.map((item) => {
          return (
            <Items
              key={item.id}
              id={item.id}
              thumb={item.thumb}
              name={item.name}
              email={item.email} />
          );
        })}
      </Row>
    </>
  );
};
export default Lists;