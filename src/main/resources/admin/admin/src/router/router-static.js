import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import kefangleixing from '@/views/modules/kefangleixing/list'
    import remenjingdian from '@/views/modules/remenjingdian/list'
    import discussjiudianxinxi from '@/views/modules/discussjiudianxinxi/list'
    import jiudianxinxi from '@/views/modules/jiudianxinxi/list'
    import jipiaoyuding from '@/views/modules/jipiaoyuding/list'
    import discusslvyouxianlu from '@/views/modules/discusslvyouxianlu/list'
    import forum from '@/views/modules/forum/list'
    import xianluleixing from '@/views/modules/xianluleixing/list'
    import yonghu from '@/views/modules/yonghu/list'
    import discussremenjingdian from '@/views/modules/discussremenjingdian/list'
    import menpiaogoumai from '@/views/modules/menpiaogoumai/list'
    import lvyouxianlu from '@/views/modules/lvyouxianlu/list'
    import jipiaoxinxi from '@/views/modules/jipiaoxinxi/list'
    import messages from '@/views/modules/messages/list'
    import jiudianyuding from '@/views/modules/jiudianyuding/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '旅游资讯',
        component: news
      }
      ,{
	path: '/kefangleixing',
        name: '客房类型',
        component: kefangleixing
      }
      ,{
	path: '/remenjingdian',
        name: '热门景点',
        component: remenjingdian
      }
      ,{
	path: '/discussjiudianxinxi',
        name: '酒店信息评论',
        component: discussjiudianxinxi
      }
      ,{
	path: '/jiudianxinxi',
        name: '酒店信息',
        component: jiudianxinxi
      }
      ,{
	path: '/jipiaoyuding',
        name: '机票预订',
        component: jipiaoyuding
      }
      ,{
	path: '/discusslvyouxianlu',
        name: '旅游线路评论',
        component: discusslvyouxianlu
      }
      ,{
	path: '/forum',
        name: '交流论坛',
        component: forum
      }
      ,{
	path: '/xianluleixing',
        name: '线路类型',
        component: xianluleixing
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/discussremenjingdian',
        name: '热门景点评论',
        component: discussremenjingdian
      }
      ,{
	path: '/menpiaogoumai',
        name: '门票购买',
        component: menpiaogoumai
      }
      ,{
	path: '/lvyouxianlu',
        name: '旅游线路',
        component: lvyouxianlu
      }
      ,{
	path: '/jipiaoxinxi',
        name: '机票信息',
        component: jipiaoxinxi
      }
      ,{
	path: '/messages',
        name: '留言板',
        component: messages
      }
      ,{
	path: '/jiudianyuding',
        name: '酒店预订',
        component: jiudianyuding
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
