import "./ItemEl.css";

const ItemEl = (props) => {
  return (
    <>
      <div className="item_el">
        <span className='title'>{props.title}</span>
		<span className='content'>{props.content}</span>
      </div>
    </>
  );
};
export default ItemEl;