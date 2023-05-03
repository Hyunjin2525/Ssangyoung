package com.sist.io2;


import java.io.Serializable;
/*
 * <table class="list-wrap">		태그명.클래스명  태그명#아이디명
 *  ---- 태그명    --------- 구분자 => class / id
 *  table.list-wrap td.info img
 * 	<tr>                           -----    ---
 *     <td class="info">            중복     중복이 없는 상태
 *        <a class="cover"><img src=""></a>
 *     </td>
 *    <td class="info">
 *        <a class="title aaa"> 노래명</a>
 *         table.list-wrap td.info a.title
 *     </td>
 *    <td class="info">
 *        <a class="artist aaa"> 가수명</a>
 *               table.list-wrap td.info a.artist
 *     </td>
 *     </tr>
 * </table>
 * <a class="info">bbbbb</a>
 */

public class MelonMusicVO implements Serializable{
	

}
