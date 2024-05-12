export function isAuth(tableName, key) {
  let role = localStorage.getItem("UserTableName");
  let menus = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["新增","查看","修改","删除","查看评论"],"menu":"热门景点","menuJump":"列表","tableName":"remenjingdian"}],"menu":"热门景点管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看","修改","删除","景点销售统计","景点类型"],"menu":"门票购买","menuJump":"列表","tableName":"menpiaogoumai"}],"menu":"门票购买管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["新增","查看","修改","删除"],"menu":"线路类型","menuJump":"列表","tableName":"xianluleixing"}],"menu":"线路类型管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["新增","查看","修改","删除","查看评论"],"menu":"旅游线路","menuJump":"列表","tableName":"lvyouxianlu"}],"menu":"旅游线路管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除"],"menu":"客房类型","menuJump":"列表","tableName":"kefangleixing"}],"menu":"客房类型管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除","查看评论"],"menu":"酒店信息","menuJump":"列表","tableName":"jiudianxinxi"}],"menu":"酒店信息管理"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看","修改","删除","酒店业绩"],"menu":"酒店预订","menuJump":"列表","tableName":"jiudianyuding"}],"menu":"酒店预订管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["新增","查看","修改","删除"],"menu":"机票信息","menuJump":"列表","tableName":"jipiaoxinxi"}],"menu":"机票信息管理"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看","修改","删除"],"menu":"机票预订","menuJump":"列表","tableName":"jipiaoyuding"}],"menu":"机票预订管理"},{"child":[{"appFrontIcon":"cuIcon-message","buttons":["查看","修改","回复","删除"],"menu":"留言板","tableName":"messages"}],"menu":"留言板"},{"child":[{"appFrontIcon":"cuIcon-group","buttons":["新增","查看","修改","删除"],"menu":"交流论坛","tableName":"forum"}],"menu":"交流论坛"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"旅游资讯","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","查看评论","立即购买"],"menu":"热门景点列表","menuJump":"列表","tableName":"remenjingdian"}],"menu":"热门景点模块"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","查看评论"],"menu":"旅游线路列表","menuJump":"列表","tableName":"lvyouxianlu"}],"menu":"旅游线路模块"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看评论","查看","立即预订"],"menu":"酒店信息列表","menuJump":"列表","tableName":"jiudianxinxi"}],"menu":"酒店信息模块"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","立即预订"],"menu":"机票信息列表","menuJump":"列表","tableName":"jipiaoxinxi"}],"menu":"机票信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看","删除","支付"],"menu":"门票购买","menuJump":"列表","tableName":"menpiaogoumai"}],"menu":"门票购买管理"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看","删除","支付"],"menu":"酒店预订","menuJump":"列表","tableName":"jiudianyuding"}],"menu":"酒店预订管理"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看","删除","支付"],"menu":"机票预订","menuJump":"列表","tableName":"jipiaoyuding"}],"menu":"机票预订管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","查看评论","立即购买"],"menu":"热门景点列表","menuJump":"列表","tableName":"remenjingdian"}],"menu":"热门景点模块"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","查看评论"],"menu":"旅游线路列表","menuJump":"列表","tableName":"lvyouxianlu"}],"menu":"旅游线路模块"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看评论","查看","立即预订"],"menu":"酒店信息列表","menuJump":"列表","tableName":"jiudianxinxi"}],"menu":"酒店信息模块"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","立即预订"],"menu":"机票信息列表","menuJump":"列表","tableName":"jipiaoxinxi"}],"menu":"机票信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}];
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

/**
 *  * 获取当前时间（yyyy-MM-dd hh:mm:ss）
 *   */
export function getCurDateTime() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate(),
    hour = currentTime.getHours(),
    minute = currentTime.getMinutes(),
    second = currentTime.getSeconds();
    return year + "-" + month + "-" + day + " " +hour +":" +minute+":"+second;
}

/**
 *  * 获取当前日期（yyyy-MM-dd）
 *   */
export function getCurDate() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate();
    return year + "-" + month + "-" + day;
}
