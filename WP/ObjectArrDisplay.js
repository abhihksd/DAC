const ObjectArrDisplay = () => {
        const emps = [{empid:1001,ename:"Amit"},{empid:1001,ename:"Amit"},{empid:1001,ename:"Amit"}]
        return (
            <div>
                <table>
                    {
                        emps.map((v)=> {
                            return (
                                <tr>
                                    <td>{v.empid}</td>
                                    <td>{v.ename}</td>
                                </tr>
                            )
                        })
                    }
                </table>
            </div>
        )
}
export default ObjectArrDisplay;