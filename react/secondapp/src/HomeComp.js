import { useSelector } from "react-redux";
import { Link, Outlet } from "react-router-dom";

export default function HomeComp() {
  const mystate = useSelector((state) => state.logged);
  return (
    <div>
      <h1>Welcome name.....</h1>
      <ul className="nav navbar">
        <li className="nav-item">
          <Link to="history" className="nav-link">
            ORder history
          </Link>
        </li>
        <li className="nav-item">
          <Link to="logout" className="nav-link">
            Logout
          </Link>
        </li>
      </ul>
      <p>LOGIN STATUS:{mystate.loggedIn.toString()}</p>
      <Outlet />
    </div>
  );
}
