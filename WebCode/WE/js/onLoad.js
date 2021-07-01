

window.onload = function () {
	//初始化省份下拉列表
	initProvince();
	//为下拉列表绑定onchange事件
    province.onchange = provinceChange;
	city.onchange = cityChange;

	//为输入文本框绑定onfocus和onblur事件处理函数
	var inputs=document.getElementsByTagName("input");
	for(var i=0;i<inputs.length;i++){
		var type=inputs[i].type;
		if(type==="text"||type==="password"){
			inputs[i].onfocus=onFoucs;
			inputs[i].onblur=onBlur;
		}
	}

}

