import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Messages from '../pages/messages/list'
import Forum from '../pages/forum/list'
import ForumAdd from '../pages/forum/add'
import ForumDetail from '../pages/forum/detail'
import MyForumList from '../pages/forum/myForumList'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import remenjingdianList from '../pages/remenjingdian/list'
import remenjingdianDetail from '../pages/remenjingdian/detail'
import remenjingdianAdd from '../pages/remenjingdian/add'
import menpiaogoumaiList from '../pages/menpiaogoumai/list'
import menpiaogoumaiDetail from '../pages/menpiaogoumai/detail'
import menpiaogoumaiAdd from '../pages/menpiaogoumai/add'
import xianluleixingList from '../pages/xianluleixing/list'
import xianluleixingDetail from '../pages/xianluleixing/detail'
import xianluleixingAdd from '../pages/xianluleixing/add'
import lvyouxianluList from '../pages/lvyouxianlu/list'
import lvyouxianluDetail from '../pages/lvyouxianlu/detail'
import lvyouxianluAdd from '../pages/lvyouxianlu/add'
import kefangleixingList from '../pages/kefangleixing/list'
import kefangleixingDetail from '../pages/kefangleixing/detail'
import kefangleixingAdd from '../pages/kefangleixing/add'
import jiudianxinxiList from '../pages/jiudianxinxi/list'
import jiudianxinxiDetail from '../pages/jiudianxinxi/detail'
import jiudianxinxiAdd from '../pages/jiudianxinxi/add'
import jiudianyudingList from '../pages/jiudianyuding/list'
import jiudianyudingDetail from '../pages/jiudianyuding/detail'
import jiudianyudingAdd from '../pages/jiudianyuding/add'
import jipiaoxinxiList from '../pages/jipiaoxinxi/list'
import jipiaoxinxiDetail from '../pages/jipiaoxinxi/detail'
import jipiaoxinxiAdd from '../pages/jipiaoxinxi/add'
import jipiaoyudingList from '../pages/jipiaoyuding/list'
import jipiaoyudingDetail from '../pages/jipiaoyuding/detail'
import jipiaoyudingAdd from '../pages/jipiaoyuding/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'messages',
					component: Messages
				},
				{
					path: 'forum',
					component: Forum
				},
				{
					path: 'forumAdd',
					component: ForumAdd
				},
				{
					path: 'forumDetail',
					component: ForumDetail
				},
				{
					path: 'myForumList',
					component: MyForumList
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'remenjingdian',
					component: remenjingdianList
				},
				{
					path: 'remenjingdianDetail',
					component: remenjingdianDetail
				},
				{
					path: 'remenjingdianAdd',
					component: remenjingdianAdd
				},
				{
					path: 'menpiaogoumai',
					component: menpiaogoumaiList
				},
				{
					path: 'menpiaogoumaiDetail',
					component: menpiaogoumaiDetail
				},
				{
					path: 'menpiaogoumaiAdd',
					component: menpiaogoumaiAdd
				},
				{
					path: 'xianluleixing',
					component: xianluleixingList
				},
				{
					path: 'xianluleixingDetail',
					component: xianluleixingDetail
				},
				{
					path: 'xianluleixingAdd',
					component: xianluleixingAdd
				},
				{
					path: 'lvyouxianlu',
					component: lvyouxianluList
				},
				{
					path: 'lvyouxianluDetail',
					component: lvyouxianluDetail
				},
				{
					path: 'lvyouxianluAdd',
					component: lvyouxianluAdd
				},
				{
					path: 'kefangleixing',
					component: kefangleixingList
				},
				{
					path: 'kefangleixingDetail',
					component: kefangleixingDetail
				},
				{
					path: 'kefangleixingAdd',
					component: kefangleixingAdd
				},
				{
					path: 'jiudianxinxi',
					component: jiudianxinxiList
				},
				{
					path: 'jiudianxinxiDetail',
					component: jiudianxinxiDetail
				},
				{
					path: 'jiudianxinxiAdd',
					component: jiudianxinxiAdd
				},
				{
					path: 'jiudianyuding',
					component: jiudianyudingList
				},
				{
					path: 'jiudianyudingDetail',
					component: jiudianyudingDetail
				},
				{
					path: 'jiudianyudingAdd',
					component: jiudianyudingAdd
				},
				{
					path: 'jipiaoxinxi',
					component: jipiaoxinxiList
				},
				{
					path: 'jipiaoxinxiDetail',
					component: jipiaoxinxiDetail
				},
				{
					path: 'jipiaoxinxiAdd',
					component: jipiaoxinxiAdd
				},
				{
					path: 'jipiaoyuding',
					component: jipiaoyudingList
				},
				{
					path: 'jipiaoyudingDetail',
					component: jipiaoyudingDetail
				},
				{
					path: 'jipiaoyudingAdd',
					component: jipiaoyudingAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
