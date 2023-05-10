package com.sist.inter;

import java.util.List;


import com.sist.manager.MelonMusicHomeVO;

public interface HomeInterface {
	public void cardPrint(List<MelonMusicHomeVO> list);
	public void cardInit(List<MelonMusicHomeVO> list);
}
