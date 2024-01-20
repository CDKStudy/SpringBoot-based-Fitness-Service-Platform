const menu = {
    list() {
        return [{
            "backMenu": [{
                "child": [{
                    "appFrontIcon": "cuIcon-list",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "用户",
                    "menuJump": "列表",
                    "tableName": "yonghu"
                }], "menu": "用户管理"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-discover",
                    "buttons": ["新增", "查看", "修改", "删除", "安排课程"],
                    "menu": "执教教练",
                    "menuJump": "列表",
                    "tableName": "zhijiaojiaolian"
                }], "menu": "执教教练管理"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-attentionfavor",
                    "buttons": ["查看", "修改", "删除"],
                    "menu": "打卡签到",
                    "menuJump": "列表",
                    "tableName": "dakaqiandao"
                }], "menu": "打卡签到管理"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-phone",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "会员卡",
                    "menuJump": "列表",
                    "tableName": "huiyuanka"
                }], "menu": "会员卡管理"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-addressbook",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "课程分类",
                    "menuJump": "列表",
                    "tableName": "kechengfenlei"
                }], "menu": "课程分类管理"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-copy",
                    "buttons": ["查看", "修改", "删除"],
                    "menu": "课程信息",
                    "menuJump": "列表",
                    "tableName": "kechengxinxi"
                }], "menu": "课程信息管理"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-paint",
                    "buttons": ["查看", "修改", "删除", "审核"],
                    "menu": "课程购买",
                    "menuJump": "列表",
                    "tableName": "kechenggoumai"
                }], "menu": "课程购买管理"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-explore",
                    "buttons": ["查看", "修改", "删除", "审核"],
                    "menu": "会员卡办理",
                    "menuJump": "列表",
                    "tableName": "huiyuankabanli"
                }], "menu": "会员卡办理管理"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-vip",
                    "buttons": ["查看", "修改", "删除", "审核"],
                    "menu": "预约教练",
                    "menuJump": "列表",
                    "tableName": "yuyuejiaolian"
                }], "menu": "预约教练管理"
            },
//数据统计
                {
                    "child": [{
                        "appFrontIcon": "cuIcon-vip",
                        "menu": "数据统计",
                        "menuJump": "列表",
                        "tableName": "HomeChart"
                    }], "menu": "数据统计管理"
                }

            //     {
            //     "child": [{
            //         "appFrontIcon": "cuIcon-time",
            //         "buttons": ["查看", "修改", "删除"],
            //         "menu": "教练评价",
            //         "menuJump": "列表",
            //         "tableName": "jiaolianpingjia"
            //     }], "menu": "教练评价管理"
            // }, {
            //     "child": [{
            //         "appFrontIcon": "cuIcon-goodsnew",
            //         "buttons": ["查看", "修改", "删除"],
            //         "menu": "通知信息",
            //         "menuJump": "列表",
            //         "tableName": "tongzhixinxi"
            //     }], "menu": "通知信息管理"
            // }, {
            //     "child": [{
            //         "appFrontIcon": "cuIcon-send",
            //         "buttons": ["新增", "查看", "修改", "删除", "损坏登记"],
            //         "menu": "健身器材",
            //         "menuJump": "列表",
            //         "tableName": "jianshenqicai"
            //     }], "menu": "健身器材管理"
            // }, {
            //     "child": [{
            //         "appFrontIcon": "cuIcon-rank",
            //         "buttons": ["查看", "修改", "删除"],
            //         "menu": "损坏登记",
            //         "menuJump": "列表",
            //         "tableName": "sunhuaidengji"
            //     }], "menu": "损坏登记管理"
            // }, {
            //     "child": [{
            //         "appFrontIcon": "cuIcon-skin",
            //         "buttons": ["新增", "查看", "修改", "删除", "报表"],
            //         "menu": "业绩统计",
            //         "menuJump": "列表",
            //         "tableName": "yejitongji"
            //     }], "menu": "业绩统计管理"
            // }, {
            //     "child": [{
            //         "appFrontIcon": "cuIcon-paint",
            //         "buttons": ["查看", "修改"],
            //         "menu": "轮播图管理",
            //         "tableName": "config"
            //     }, {
            //         "appFrontIcon": "cuIcon-news",
            //         "buttons": ["新增", "查看", "修改", "删除"],
            //         "menu": "俱乐部公告",
            //         "tableName": "news"
            //     }], "menu": "系统管理"
            // }
            ],
            "frontMenu": [{
                "child": [{
                    "appFrontIcon": "cuIcon-attentionfavor",
                    "buttons": ["查看", "办理"],
                    "menu": "会员卡列表",
                    "menuJump": "列表",
                    "tableName": "huiyuanka"
                }], "menu": "会员卡模块"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-paint",
                    "buttons": ["查看", "购买"],
                    "menu": "课程信息列表",
                    "menuJump": "列表",
                    "tableName": "kechengxinxi"
                }], "menu": "课程信息模块"
            }],
            "hasBackLogin": "是",
            "hasBackRegister": "否",
            "hasFrontLogin": "否",
            "hasFrontRegister": "否",
            "roleName": "管理员",
            "tableName": "users"
        }, {
            "backMenu": [{
                "child": [{
                    "appFrontIcon": "cuIcon-attentionfavor",
                    "buttons": ["新增", "查看", "删除"],
                    "menu": "打卡签到",
                    "menuJump": "列表",
                    "tableName": "dakaqiandao"
                }], "menu": "打卡签到管理"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-paint",
                    "buttons": ["查看", "支付", "预约教练"],
                    "menu": "课程购买",
                    "menuJump": "列表",
                    "tableName": "kechenggoumai"
                }], "menu": "课程购买管理"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-explore",
                    "buttons": ["支付", "查看", "删除"],
                    "menu": "会员卡办理",
                    "menuJump": "列表",
                    "tableName": "huiyuankabanli"
                }], "menu": "会员卡办理管理"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-vip",
                    "buttons": ["查看", "删除"],
                    "menu": "预约教练",
                    "menuJump": "列表",
                    "tableName": "yuyuejiaolian"
                }], "menu": "预约教练管理"
            }
            // , {
            //     "child": [{
            //         "appFrontIcon": "cuIcon-time",
            //         "buttons": ["查看", "删除"],
            //         "menu": "教练评价",
            //         "menuJump": "列表",
            //         "tableName": "jiaolianpingjia"
            //     }], "menu": "教练评价管理"
            // }, {
            //     "child": [{
            //         "appFrontIcon": "cuIcon-goodsnew",
            //         "buttons": ["查看"],
            //         "menu": "通知信息",
            //         "menuJump": "列表",
            //         "tableName": "tongzhixinxi"
            //     }], "menu": "通知信息管理"}
            ],
            "frontMenu": [{
                "child": [{
                    "appFrontIcon": "cuIcon-attentionfavor",
                    "buttons": ["查看", "办理"],
                    "menu": "会员卡列表",
                    "menuJump": "列表",
                    "tableName": "huiyuanka"
                }], "menu": "会员卡模块"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-paint",
                    "buttons": ["查看", "购买"],
                    "menu": "课程信息列表",
                    "menuJump": "列表",
                    "tableName": "kechengxinxi"
                }], "menu": "课程信息模块"
            }],
            "hasBackLogin": "是",
            "hasBackRegister": "否",
            "hasFrontLogin": "是",
            "hasFrontRegister": "是",
            "roleName": "用户",
            "tableName": "yonghu"
        }, {
            "backMenu": [{
                "child": [{
                    "appFrontIcon": "cuIcon-copy",
                    "buttons": ["查看"],
                    "menu": "课程信息",
                    "menuJump": "列表",
                    "tableName": "kechengxinxi"
                }], "menu": "课程信息管理"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-paint",
                    "buttons": ["查看"],
                    "menu": "课程购买",
                    "menuJump": "列表",
                    "tableName": "kechenggoumai"
                }], "menu": "课程购买管理"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-vip",
                    "buttons": ["查看", "审核"],
                    "menu": "预约教练",
                    "menuJump": "列表",
                    "tableName": "yuyuejiaolian"
                }], "menu": "预约教练管理"
            }],
            "frontMenu": [{
                "child": [{
                    "appFrontIcon": "cuIcon-attentionfavor",
                    "buttons": ["查看", "办理"],
                    "menu": "会员卡列表",
                    "menuJump": "列表",
                    "tableName": "huiyuanka"
                }], "menu": "会员卡模块"
            }, {
                "child": [{
                    "appFrontIcon": "cuIcon-paint",
                    "buttons": ["查看", "购买"],
                    "menu": "课程信息列表",
                    "menuJump": "列表",
                    "tableName": "kechengxinxi"
                }], "menu": "课程信息模块"
            }],
            "hasBackLogin": "是",
            "hasBackRegister": "否",
            "hasFrontLogin": "否",
            "hasFrontRegister": "否",
            "roleName": "执教教练",
            "tableName": "zhijiaojiaolian"
        }]
    }
}
export default menu;
