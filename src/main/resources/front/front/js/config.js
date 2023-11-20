
var projectName = '大学生心理健康咨询系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
]


var indexNav = [

{
	name: '系统公告',
	url: './pages/xitonggonggao/list.html'
}, 
{
	name: '心理咨询师',
	url: './pages/xinlizixunshi/list.html'
}, 
{
	name: '心灵专栏',
	url: './pages/xinlingzhuanlan/list.html'
}, 
{
	name: '压力测试',
	url: './pages/yaliceshi/list.html'
}, 
{
	name: '小纸条',
	url: './pages/xiaozhitiao/list.html'
}, 

]

var adminurl =  "http://localhost:8080/springbootu72sl/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"系统公告","menuJump":"列表","tableName":"xitonggonggao"}],"menu":"系统公告管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核","查看评论"],"menu":"心理咨询师","menuJump":"列表","tableName":"xinlizixunshi"}],"menu":"心理咨询师管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"心灵专栏","menuJump":"列表","tableName":"xinlingzhuanlan"}],"menu":"心灵专栏管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"压力测试","menuJump":"列表","tableName":"yaliceshi"}],"menu":"压力测试管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"测试数据","menuJump":"列表","tableName":"ceshishuju"}],"menu":"测试数据管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"咨询师预约","menuJump":"列表","tableName":"zixunshiyuyue"}],"menu":"咨询师预约管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"小纸条","menuJump":"列表","tableName":"xiaozhitiao"}],"menu":"小纸条管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"聊天","tableName":"chat"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"系统公告列表","menuJump":"列表","tableName":"xitonggonggao"}],"menu":"系统公告模块"},{"child":[{"buttons":["查看","预约","预约线下"],"menu":"心理咨询师列表","menuJump":"列表","tableName":"xinlizixunshi"}],"menu":"心理咨询师模块"},{"child":[{"buttons":["查看"],"menu":"心灵专栏列表","menuJump":"列表","tableName":"xinlingzhuanlan"}],"menu":"心灵专栏模块"},{"child":[{"buttons":["查看","测试"],"menu":"压力测试列表","menuJump":"列表","tableName":"yaliceshi"}],"menu":"压力测试模块"},{"child":[{"buttons":["查看"],"menu":"小纸条列表","menuJump":"列表","tableName":"xiaozhitiao"}],"menu":"小纸条模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","删除"],"menu":"测试数据","menuJump":"列表","tableName":"ceshishuju"}],"menu":"测试数据管理"},{"child":[{"buttons":["查看","删除"],"menu":"咨询师预约","menuJump":"列表","tableName":"zixunshiyuyue"}],"menu":"咨询师预约管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"小纸条","menuJump":"列表","tableName":"xiaozhitiao"}],"menu":"小纸条管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"系统公告列表","menuJump":"列表","tableName":"xitonggonggao"}],"menu":"系统公告模块"},{"child":[{"buttons":["查看","预约","预约线下"],"menu":"心理咨询师列表","menuJump":"列表","tableName":"xinlizixunshi"}],"menu":"心理咨询师模块"},{"child":[{"buttons":["查看"],"menu":"心灵专栏列表","menuJump":"列表","tableName":"xinlingzhuanlan"}],"menu":"心灵专栏模块"},{"child":[{"buttons":["查看","测试"],"menu":"压力测试列表","menuJump":"列表","tableName":"yaliceshi"}],"menu":"压力测试模块"},{"child":[{"buttons":["查看"],"menu":"小纸条列表","menuJump":"列表","tableName":"xiaozhitiao"}],"menu":"小纸条模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"buttons":["查看","删除"],"menu":"咨询师预约","menuJump":"列表","tableName":"zixunshiyuyue"}],"menu":"咨询师预约管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"聊天","tableName":"chat"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"系统公告列表","menuJump":"列表","tableName":"xitonggonggao"}],"menu":"系统公告模块"},{"child":[{"buttons":["查看","预约","预约线下"],"menu":"心理咨询师列表","menuJump":"列表","tableName":"xinlizixunshi"}],"menu":"心理咨询师模块"},{"child":[{"buttons":["查看"],"menu":"心灵专栏列表","menuJump":"列表","tableName":"xinlingzhuanlan"}],"menu":"心灵专栏模块"},{"child":[{"buttons":["查看","测试"],"menu":"压力测试列表","menuJump":"列表","tableName":"yaliceshi"}],"menu":"压力测试模块"},{"child":[{"buttons":["查看"],"menu":"小纸条列表","menuJump":"列表","tableName":"xiaozhitiao"}],"menu":"小纸条模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"心理咨询师","tableName":"xinlizixunshi"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
