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
    import yuyuejiaolian from '@/views/modules/yuyuejiaolian/list'
    import huiyuanka from '@/views/modules/huiyuanka/list'
    import jianshenqicai from '@/views/modules/jianshenqicai/list'
    import kechengxinxi from '@/views/modules/kechengxinxi/list'
    import sunhuaidengji from '@/views/modules/sunhuaidengji/list'
    import jiaolianpingjia from '@/views/modules/jiaolianpingjia/list'
    import kechengfenlei from '@/views/modules/kechengfenlei/list'
    import huiyuankabanli from '@/views/modules/huiyuankabanli/list'
    import yonghu from '@/views/modules/yonghu/list'
    import dakaqiandao from '@/views/modules/dakaqiandao/list'
    import tongzhixinxi from '@/views/modules/tongzhixinxi/list'
    import zhijiaojiaolian from '@/views/modules/zhijiaojiaolian/list'
    import kechenggoumai from '@/views/modules/kechenggoumai/list'
    import yejitongji from '@/views/modules/yejitongji/list'
    import config from '@/views/modules/config/list'
import HomeChart from "../components/home/HomeChart";


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
        name: '俱乐部公告',
        component: news
      }
      ,{
	path: '/yuyuejiaolian',
        name: '预约教练',
        component: yuyuejiaolian
      }
      ,{
	path: '/huiyuanka',
        name: '会员卡',
        component: huiyuanka
      }
      ,{
	path: '/jianshenqicai',
        name: '健身器材',
        component: jianshenqicai
      },

      //展示统计信息
      {
        path: '/HomeChart',
        name: '数据统计',
        component: HomeChart,
        meta: {icon:'', title:'HomeChart'}
      },


      {
	path: '/kechengxinxi',
        name: '课程信息',
        component: kechengxinxi
      }
      ,{
	path: '/sunhuaidengji',
        name: '损坏登记',
        component: sunhuaidengji
      }
      ,{
	path: '/jiaolianpingjia',
        name: '教练评价',
        component: jiaolianpingjia
      }
      ,{
	path: '/kechengfenlei',
        name: '课程分类',
        component: kechengfenlei
      }
      ,{
	path: '/huiyuankabanli',
        name: '会员卡办理',
        component: huiyuankabanli
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/dakaqiandao',
        name: '打卡签到',
        component: dakaqiandao
      }
      ,{
	path: '/tongzhixinxi',
        name: '通知信息',
        component: tongzhixinxi
      }
      ,{
	path: '/zhijiaojiaolian',
        name: '执教教练',
        component: zhijiaojiaolian
      }
      ,{
	path: '/kechenggoumai',
        name: '课程购买',
        component: kechenggoumai
      }
      ,{
	path: '/yejitongji',
        name: '业绩统计',
        component: yejitongji
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

export default router;
