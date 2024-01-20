const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootcbz46/",
            name: "springbootcbz46",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootcbz46/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "健身服务平台系统"
        } 
    }
}
export default base
