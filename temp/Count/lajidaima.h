        public int QuFanshu(int[] Mianzi, int[] quPai, int style, int paopai, int con1, int con2)
        {
            int ans = 0;
            if (style == 3)
            {
                ans = 3;
                int[] tempPai = (int[])quPai.Clone();
                //大七星
                if (ChkDaqixin(tempPai))
                    return 26;
                //大车轮
                if (ChkDachelun(tempPai))
                    return 13;
                //混一色
                if (ChkHunyise(tempPai))
                {
                    //清一色
                    if (ChkQingyise(tempPai))
                    {
                        ans = ans + 3;
                    }
                    ans = ans + 3;
                }
                //混老头
                if (ChkHunlaotou(tempPai))
                    ans = ans + 2;
                //断幺
                if (ChkDuanyao(tempPai))
                    ans++;
                //宝牌
                ans = ans + tempPai[Dora];
            }
            else if ((style < 3)&&(style>0))
            {
                int[] tempPai = (int[])quPai.Clone();
                ans = 0;
                //大车轮
                if (ChkDachelun(tempPai))
                    return 13;
                //大四喜
                if (ChkDasixi(tempPai))
                    ans = ans + 2;
                //小四喜
                else if (ChkXiaosixi(tempPai))
                    ans++;
                //四暗单骑
                if (ChkSiandanji(Mianzi, style))
                    ans = ans + 2;
                //大三元
                if (ChkDasanyuan(tempPai))
                    ans++;
                //清老头
                if (ChkQinglaotou(tempPai))
                    ans++;
                //绿一色
                if (ChkLvyise(tempPai))
                    ans++;
                //九莲宝灯
                if (ChkJiulian(tempPai))
                {
                    //纯正九莲
                    if (ChkChunjiulian(tempPai, paopai))
                        ans = ans + 2;
                    else ans++;
                }
                //红孔雀
                if (ChkHongkongque(tempPai))
                    ans++;
                //百万石
                if (ChkBaiwandan(tempPai))
                {
                    //纯正百万
                    if (ChkChunbaiwandan(tempPai))
                        ans = ans + 2;
                    else
                        ans++;
                }
                //东北新干线
                if (ChkDongbeixinganxian(tempPai))
                    ans++;
                if (ans >= 1)
                {
                    ans = ans * 26;
                }
                else
                {
                    ans = 1;
                    //小三元
                    if (ChkXiaosanyuan(tempPai))
                        ans = ans + 2;
                    //混一色
                    if (ChkHunyise(tempPai))
                    {
                        //清一色
                        if (ChkQingyise(tempPai))
                        {
                            ans = ans + 3;
                        }
                        ans = ans + 3;
                    }
                    //混老头
                    if (ChkHunlaotou(tempPai))
                        ans = ans + 2;
                    //纯全带
                    else if (ChkChunquandaiyao(tempPai, Mianzi))
                        ans = ans + 3;
                    //混全带
                    else if (ChkHunquandaiyao(tempPai, Mianzi))
                        ans = ans + 2;
                    //断幺
                    else if (ChkDuanyao(tempPai))
                        ans++;
                    //三同刻
                    if (ChkSantongke(Mianzi))
                        ans = ans + 2;
                    //三暗刻
                    if (ChkSananke(tempPai,Mianzi,paopai))
                        ans = ans + 2;
                    //对对胡
                    if (ChkDuiduihu(Mianzi, style))
                        ans = ans + 2;
                    //三色同顺
                    else if (ChkSansetongshun(Mianzi))
                        ans = ans + 2;
                    //一气通贯
                    else if (ChkYiqi(Mianzi))
                        ans = ans + 2;
                    //两杯口
                    if (ChkLiangbeikou(Mianzi))
                        ans = ans + 3;
                    //两杯口
                    else if (ChkYibeikou(Mianzi))
                        ans++;
                    //平胡
                    if (ChkPinghu(Mianzi, style, paopai))
                        ans++;
                    //役牌
                    else ans = ans + ChkYipai(Mianzi, ju, (con1 + 4 - Zhuang) % 4);
                    //宝牌  
                    ans = ans + tempPai[Dora];
                    if (ans > 13)
                        ans = 13;
                }
            }
            else if (style==4)
            {
                if (tempPai[paopai] == 2)
                    return 26;
                else return 13;
            }
            return ans;
        }

        public bool ChkDaqixin(int[] Pai)
        {
            for (int i = 0; i < 7; i++)
            {
                if (Pai[i + 27] != 2)
                    return false;
            }
            return true;
        }

        public bool ChkDachelun(int[] Pai)
        {
            for (int i = 0; i < 7; i++)
            {
                if (Pai[i + 19] != 2)
                    return false;
            }
            return true;
        }

        public bool ChkHunyise(int[] Pai)
        {
            int yanse = 0;
            int[] tempPai = (int[])Pai.Clone();
            for (int i = 0; i < 27; i++)
            {
                if (Pai[i] != 0)
                {
                    yanse = i / 9;
                    break;
                }
            }
            for (int i = 0; i < 9; i++)
            {
                tempPai[i + yanse * 9] = 0;
            }
            for (int i = 0; i < 27; i++)
            {
                if (tempPai[i] != 0)
                    return false;
            }
            return true;
        }

        public bool ChkQingyise(int[] Pai)
        {
            if (ChkHunyise(Pai))
            {
                for (int i = 0; i < 7; i++)
                    if (Pai[i + 27] != 0)
                        return false;
                return true;
            }
            else return false;
        }

        public bool ChkHunlaotou(int[] Pai)
        {
            int[] tempPai = (int[])Pai.Clone();
            for (int i = 0; i < 13; i++)
            {
                tempPai[Laotou[i]] = 0;
            }
            for (int i = 0; i < 34; i++)
            {
                if (tempPai[i] != 0)
                    return false;
            }
            return true;
        }

        public bool ChkQinglaotou(int[] Pai)
        {
            if (ChkHunlaotou(Pai))
            {
                for (int i = 0; i < 7; i++)
                    if (Pai[i + 27] != 0)
                        return false;
                return true;
            }
            else return false;
        }

        public bool ChkDuanyao(int[] Pai)
        {
            for (int i = 0; i < 13; i++)
            {
                if (Pai[Laotou[i]] != 0)
                    return false;
            }
            return true;
        }

        public bool ChkDasixi(int[] Pai)
        {
            for (int i = 0; i < 4; i++)
            {
                if (Pai[i+27] != 3)
                    return false;
            }
            return true;
        }

        public bool ChkXiaosixi(int[] Pai)
        {
            int count = 0;
            for (int i = 0; i < 4; i++)
            {
                if (Pai[i+27] <= 3)
                    count = count + Pai[i + 27];
            }
            if (count != 11)
                return false;
            return true;
        }

        public bool ChkSiandanji(int[] Mianzi, int style)
        {
            if (style != 1)
                return false;
            for (int i = 0; i < 4; i++)
            {
                if (Mianzi[i] > 33)
                    return false;
            }
            return true;
        }

        public bool ChkDasanyuan(int[] Pai)
        {
            for (int i = 0; i < 3; i++)
                if (Pai[i + 31] != 3)
                    return false;
            return true;
        }

        public bool ChkXiaosanyuan(int[] Pai)
        {
            int count = 0;
            for (int i = 0; i < 3; i++)
            {
                if (Pai[i + 31] <= 3)
                    count = count + Pai[i + 31];
            }
            if (count != 8)
                return false;
            return true;
        }

        public bool ChkLvyise(int[] Pai)
        {
            int[] tempPai = (int[])Pai.Clone();
            tempPai[19] = 0;
            tempPai[20] = 0;
            tempPai[21] = 0;
            tempPai[23] = 0;
            tempPai[25] = 0;
            tempPai[32] = 0;
            for (int i = 0; i < 34; i++)
                if (tempPai[i] != 0)
                    return false;
            return true;
        }

        public bool ChkJiulian(int[] Pai)
        {
            int yanse = 0;
            for (int i = 0; i < 27; i++)
            {
                if (Pai[i] != 0)
                {
                    yanse = i / 9;
                    break;
                }
            }
            if ((Pai[yanse * 9] < 3) || (Pai[yanse * 9 + 8] < 3))
                return false;
            for (int i = 0; i < 7; i++)
                if (Pai[yanse * 9 + 1 + i] < 1)
                    return false;
            return true;
        }

        public bool ChkChunjiulian(int[] Pai,int paopai)
        {
            if (ChkJiulian(tempPai)&&(Pai[paopai] >= 2))
            {
                if ((paopai % 9 != 0) && (paopai % 9 != 8))
                {
                    return true;
                }
                else if (Pai[paopai] == 4)
                {
                    return true;
                }
                else return false;
            }
            else return false;
        }

        public bool ChkHongkongque(int[] Pai)
        {
            int[] tempPai = (int[])Pai.Clone();
            tempPai[18] = 0;
            tempPai[22] = 0;
            tempPai[24] = 0;
            tempPai[26] = 0;
            tempPai[33] = 0;
            for (int i = 0; i < 34; i++)
                if (tempPai[i] != 0)
                    return false;
            return true;
        }

        public bool ChkBaiwandan(int[] Pai)
        {
            for (int i = 9; i < 34; i++)
                if (Pai[i] != 0)
                    return false;
            int count=0;
            for (int i = 0; i < 8; i++)
            {
                count = count + Pai[i] * (i + 1);
            }
            if (count>=100)
                return true;
            else return false;
        }

        public bool ChkChunbaiwandan(int[] Pai)
        {
            for (int i = 9; i < 34; i++)
                if (Pai[i] != 0)
                    return false;
            int count = 0;
            for (int i = 0; i < 8; i++)
            {
                count = count + Pai[i] * (i + 1);
            }
            if (count == 100)
                return true;
            else return false;
        }

        public bool ChkDongbeixinganxian(int[] Pai)
        {
            for (int i = 18; i < 26; i++)
                if (Pai[i] != 1)
                    return false;
            if ((Pai[27] >= 2) && (Pai[30] >= 2))
                return true;
            else return false;
        }

        public bool ChkHunquandaiyao(int[] Pai, int[] Mianzi)
        {
            int[] tempMianzi = new int[55];
            for (int i = 0; i < 4; i++)
            {
                tempMianzi[Mianzi[i]]++;
            }
            for (int i=0;i<13;i++)
                tempMianzi[Laotou[i]] = 0;
            tempMianzi[34] = 0;
            tempMianzi[40] = 0;
            tempMianzi[41] = 0;
            tempMianzi[47] = 0;
            tempMianzi[48] = 0;
            tempMianzi[54] = 0;
            for (int i = 0; i < 55; i++)
            {
                if (tempMianzi[i] != 0)
                    return false;
            }
            int[] huanyuan=QuHuanyuan(Mianzi, 4);
            int[] tempPai = (int[])(Pai.Clone());
            int count = 0;
            for (int i = 0; i < 34; i++)
            {
                tempPai[i] = Pai[i] - huanyuan[i];
            }
            for (int i = 0; i < 13; i++)
            {
                if (Pai[Laotou[i]] == 2)
                    count++;
                else if (Pai[Laotou[i]]!=0)
                    return false;
            }
            if (count != 1)
                return false;
            return true;
        }

        public bool ChkChunquandaiyao(int[] Pai, int[] Mianzi)
        {
            if (ChkHunquandaiyao(Pai, Mianzi))
            {
                for (int i = 0; i < 7; i++)
                    if (Pai[i + 27] != 0)
                        return false;
                return true;
            }
            else return false;
        }

        public bool ChkSantongke(int[] Mianzi)
        {
            int[] tempMianzi = new int[55];
            for (int i = 0; i < 4; i++)
            {
                tempMianzi[Mianzi[i]]++;
            }
            for (int i = 0; i < 9; i++)
            {
                if ((tempMianzi[i] == 1) && (tempMianzi[9 + i] == 1) && (tempMianzi[18 + i] == 1))
                    return true;
            }
            return false;
        }

        public bool ChkSansetongshun(int[] Mianzi)
        {
            int[] tempMianzi = new int[55];
            for (int i = 0; i < 4; i++)
            {
                tempMianzi[Mianzi[i]]++;
            }
            for (int i = 0; i < 7; i++)
            {
                if ((tempMianzi[34+i] >= 1) && (tempMianzi[41 + i] >= 1) && (tempMianzi[48 + i] >= 1))
                    return true;
            }
            return false;
        }

        public bool ChkYiqi(int[] Mianzi)
        {
            int[] tempMianzi = new int[55];
            for (int i = 0; i < 4; i++)
            {
                tempMianzi[Mianzi[i]]++;
            }
            for (int i = 0; i < 3; i++)
            {
                if ((tempMianzi[34 + i * 7] >= 1) && (tempMianzi[37 + i * 7] >= 1) && (tempMianzi[40 + i * 7] >= 1))
                    return true;
            }
            return false;
        }

        public bool ChkYibeikou(int[] Mianzi)
        {
            int[] tempMianzi = new int[55];
            int count = 0;
            for (int i = 0; i < 4; i++)
            {
                tempMianzi[Mianzi[i]]++;
            }
            for (int i = 34; i < 55; i++)
            {
                if (tempMianzi[i] >= 2)
                    count++;
            }
            if (count == 1)
                return true;
            return false;
        }

        public bool ChkLiangbeikou(int[] Mianzi)
        {
            int[] tempMianzi = new int[55];
            int count = 0;
            for (int i = 0; i < 4; i++)
            {
                tempMianzi[Mianzi[i]]++;
            }
            for (int i = 34; i < 55; i++)
            {
                if (tempMianzi[i] >= 2)
                    count++;
            }
            if (count == 2)
                return true;
            return false;
        }

        public bool ChkDuiduihu(int[] Mianzi, int style)
        {
            if (style != 2)
                return false;
            for (int i = 0; i < 4; i++)
            {
                if (Mianzi[i] > 33)
                    return false;
            }
            return true;
        }

        public bool ChkSananke(int[] Pai, int[] Mianzi,int paopai)
        {
            int count = 0;
            for (int i = 0; i < 4; i++)
            {
                if (Mianzi[i] < 34)
                    count++;
            }
            if ((count == 3)&&(Pai[paopai]-1>2))
                return true;
            else return false;
        }

        public bool ChkPinghu(int[] Mianzi, int style, int paopai)
        {
            if (style != 2)
                return false;
            int[] tempMianzi = new int[55];
            for (int i = 0; i < 4; i++)
            {
                tempMianzi[Mianzi[i]]++;
            }
            for (int i = 0; i < 4; i++)
            {
                if (Mianzi[i] < 34)
                    return false;
            }
            if (paopai>26)
                return false;
            if (((paopai >= 3) && (paopai <= 5)) || ((paopai >= 12) && (paopai <= 14)) || ((paopai >= 21) && (paopai <= 23)))
            {
                if ((tempMianzi[paopai / 9 * 7 + paopai % 9 - 2 + 34] > 0) || (tempMianzi[paopai / 9 * 7 + paopai % 9 + 34] > 0))
                    return true;
            }
            else if (((paopai >= 0) && (paopai <= 2)) || ((paopai >= 9) && (paopai <= 11)) || ((paopai >= 18) && (paopai <= 20)))
            {
                if (tempMianzi[paopai / 9 * 7 + paopai % 9 + 34] > 0)
                    return true;
            }
            else if (((paopai >= 6) && (paopai <= 8)) || ((paopai >= 15) && (paopai <= 17)) || ((paopai >= 24) && (paopai <= 26)))
            {
                if (tempMianzi[paopai / 9 * 7 + paopai % 9 - 2 + 34] > 0)
                    return true;
            }
            return false;
        }

        public int ChkYipai(int[] Mianzi, int con1, int con2)
        {
            int[] tempMianzi = new int[55];
            int count = 0;
            for (int i = 0; i < 4; i++)
            {
                tempMianzi[Mianzi[i]]++;
            }
            for (int i = 31; i < 34; i++)
            {
                if (tempMianzi[i] == 1)
                    count++;
            }
            if (tempMianzi[con1 / 4 + 27] == 1)
                count++;
            if (tempMianzi[con2 + 27] == 1)
                count++;
            return count;
        }