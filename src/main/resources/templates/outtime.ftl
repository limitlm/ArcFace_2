<!DOCTYPE html >
<html>
<head>
    <meta charset="utf-8">
    <title>人脸识别系统</title>

    <link rel="stylesheet" href="layui/css/layui.css">

    <script src="jquery/jquery-3.3.1.min.js"></script>
    <script src="/layui/layui.js"></script>

</head>
<body>
<div class="layui-tab">
    <ul class="layui-tab-title">
        <li class="layui-this">模拟出寝摄像头</li>
    </ul>
    <div style="position: absolute;margin-left: 40px">
        <style type="text/css">
            table.hovertable {
                font-family: verdana, arial, sans-serif;
                font-size: 11px;
                color: #333333;
                border-width: 1px;
                border-color: #999999;
                border-collapse: collapse;
            }

            table.hovertable th {
                background-color: #c3dde0;
                border-width: 1px;
                padding: 8px;
                border-style: solid;
                border-color: #a9c6c9;
            }

            table.hovertable tr {
                background-color: #d4e3e5;
            }

            table.hovertable td {
                border-width: 1px;
                padding: 8px;
                border-style: solid;
                border-color: #a9c6c9;
            }
        </style>
    </div>
    <div class="layui-tab-content" style="">
        <div class="layui-tab-item layui-show"><#include "face_search.ftl"></div>
    </div>
</div>

<script>
    //注意：选项卡 依赖 element 模块，否则无法进行功能性操作
    layui.use('element', function () {
        var element = layui.element;

    });
</script>
</html>