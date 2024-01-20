<template>
  <div class="main-content">
    <div style="width:1200px;height: 300px;">
      <div id="mychart" style="width: 600px;float:left;height: 300px;"></div>
      <div id="pieReport" style="width: 600px;float:left;height: 300px;"></div>
    </div>
  <div id="home-chart" style="width:1200px;height:400px;"></div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      charts: "",
      opinion: ["订单未支付人数", "订单支付人数"],
      opinionData: [
        { value: 12, name: "订单未支付人数", itemStyle: "#1ab394" },
        { value: 18, name: "订单支付人数", itemStyle: "#79d2c0" }
      ],

//柱状图
      xData: ["胸部训练", "背部训练", "肩部训练", "腿部训练", "手臂训练", "有氧训练"], //横坐标
      yData: [23, 24, 18, 25, 27, 40], //数据
     // myChartStyle: { float: "left", width: "100%", height: "400px" } //图表样式
}
  },

  mounted() {
    this.$nextTick(function() {
      this.drawPie("pieReport");
    });
    this.initEcharts();
    this.homeChart()
  },
  methods: {
    homeChart() {
      // 基于准备好的dom，初始化echarts实例
      var myChart = this.$echarts.init(document.getElementById("home-chart"));
      // 指定图表的配置项和数据
      var option = {
        tooltip: {
          trigger: "axis"
        },
        legend: {
          data: ["办卡量", "授课量", "收入"]
        },
        grid: {
          left: "3%",
          right: "4%",
          bottom: "3%",
          containLabel: true
        },
        xAxis: {
          type: "category",
          boundaryGap: false,
          data: [
            "1月",
            "2月",
            "3月",
            "4月",
            "5月",
            "6月",
            "7月",
            "8月",
            "9月",
            "10月",
            "11月",
            "12月"
          ]
        },
        yAxis: {
          type: "value"
        },
        series: [
          {
            name: "办卡量",
            type: "line",
            stack: "总量",
            data: [
              120,
              132,
              101,
              134,
              90,
              230,
              210,
              120,
              132,
              101,
              134,
              90,
              230
            ]
          },
          {
            name: "授课量",
            type: "line",
            stack: "总量",
            data: [
              220,
              182,
              191,
              234,
              290,
              330,
              310,
              182,
              191,
              234,
              290,
              330,
              310
            ]
          },
          {
            name: "收入",
            type: "line",
            stack: "总量",
            data: [
              150,
              232,
              201,
              154,
              190,
              330,
              410,
              232,
              201,
              154,
              190,
              330,
              410
            ]
          }
        ]
      };

      // // 使用刚指定的配置项和数据显示图表。
      myChart.setOption(option);
      //根据窗口的大小变动图表
      window.onresize = function() {
        myChart.resize();
      };
    },


    drawPie(id) {
      this.charts = this.$echarts.init(document.getElementById(id));
      this.charts.setOption({
        tooltip: {
          trigger: "item",
          formatter: "{a}<br/>{b}:{c} ({d}%)"
        },
        legend: {
          bottom: 10,
          left: "center",
          data: this.opinion
        },
        series: [
          {
            name: "状态",
            type: "pie",
            radius: "65%",
            center: ["50%", "50%"],
            avoidLabelOverlap: false,
            itemStyle: {
              emphasis: {
                shadowBlur: 10,
                shadowOffsetX: 0,
                shadowColor: "rgba(0, 0, 0, 0.5)"
              },
              color: function(params) {
                //自定义颜色
                var colorList = ["#1ab394", "#79d2c0"];
                return colorList[params.dataIndex];
              }
            },
            data: this.opinionData
          }
        ]
      });
    },


    initEcharts() {
      // 基本柱状图
      const option = {
        xAxis: {
          data: this.xData
        },
        yAxis: {},
        series: [
          {
            type: "bar", //形状为柱状图
            data: this.yData
          }
        ]
      };
      const myChart2 = this.$echarts.init(document.getElementById("mychart"));
      myChart2.setOption(option);
      //随着屏幕大小调节图表
      window.addEventListener("resize", () => {
        myChart2.resize();
      });
    }
  }
};
</script>
<style lang="scss" scoped>
#home-chart {
  background: #ffffff;
  padding: 20px 0;
}
</style>
