package com.app.model;

import java.util.List;

public class CampaignFeed {

  public static List<Campaign> list() {
    return List.of(
        new Campaign("2025-12-28", "年末セール：全品10%OFF（12/31まで）"),
        new Campaign("2025-12-25", "送料無料キャンペーン（3,000円以上）"),
        new Campaign("2025-12-01", "新規会員クーポン：500円OFF")
    );
  }

  private CampaignFeed() {}
}