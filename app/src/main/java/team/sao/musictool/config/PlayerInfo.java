package team.sao.musictool.config;

/**
 * \* Author: MrWangx
 * \* Date: 2019/5/30
 * \* Time: 21:19
 * \* Description:
 **/
public class PlayerInfo {

    public static final String SONG = "SONG";

    public static final String OPERATE = "OPTERATE";

    public static final int OP_PAUSE = 0;              //暂停
    public static final int OP_PLAY = 1;               //播放
    public static final int OP_NEXT_SONG = 2;          //下一首
    public static final int OP_PRE_SONG = 3;           //上一首
    public static final int OP_RESUME = 4;            //恢复播放
    public static final int OP_UPDATE_UI = 5;         //更新ui

    //播放状态
    public static final String STATUS = "STATUS";

    public static final int STATUS_PAUSE = 0;
    public static final int STATUS_PLAYING = 1;

}
