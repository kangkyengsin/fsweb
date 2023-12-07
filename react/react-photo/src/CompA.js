import CompAA from "./CompAA";
const style = {
  color: "white",
  width: "80%",
  padding: "20px",
  background: "#d3b1b1",
  textAlign: "center",
  borderRadius: "20px",
  marginRight: "20px",
  marginTop: "20px",
};
const CompA = (props) => {
  return (
    <div style={style}>
      <CompAA />
    </div>
  );
};
export default CompA;