import './ItemThumb.css';

const ItemThumb = (props) => {
	return (
		<div className='list_img'>
			<img src={props.thumb} alt={props.name} />
		</div>
	);
};
export default ItemThumb;