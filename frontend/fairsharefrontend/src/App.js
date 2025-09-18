import "./App.css";
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import Login from "./pages/Login";

function App() {
    return (
        <div>
            <Login />
        </div>
    );
    // <Routes>
    //     <Route path="/" element={<>Dashboard</>}></Route>
    //     <Route path="/groups" element={<Groups />} />
    // </Routes>;
}

export default App;
