import CompA from './CompA';
const style = {
	color: 'white',
	background: '#23b1c2',
	width: '50%',
	textAlign: 'center',
	borderRadius: '20px',
	margin: '20px auto',
	padding: '20px',
};
const Comp = (props) => {
	return (
		<div style={style}>
			<CompA />
		</div>
	);
};
export default Comp;