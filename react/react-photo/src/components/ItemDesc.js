import './ItemDesc.css';

const ItemDesc = (props) => {
    return (
        <>
            <div className='list_desc'>
                <span className='title'>이름</span>
                <span className='text'>{props.name}</span>
            </div>
            <div className='list_desc'>
                <span className='title'>이메일</span>
                <span className='text'>{props.email}</span>
            </div>
        </>
    );
};
export default ItemDesc;