# Android13

- [テーマアプリのアイコン](https://developer.android.com/about/versions/13/features#developer-productivity)
- [クイック設定配置API](https://developer.android.com/about/versions/13/features#quick-settings)
- [多言語ユーザーのサポートの向上](https://developer.android.com/about/versions/13/features#language-support)
- [日本語のテキストラッピングの改善](https://developer.android.com/about/versions/13/features#japanese-wrapping)
- 非ラテン文字の行の高さの改善
- [テキスト変換API](https://developer.android.com/about/versions/13/features#text-conversion)
- Unicodeライブラリの更新
- BluetoothLEオーディオ
  - >ハイファイオーディオを受信できるように設計されており、BluetoothClassicでは不可能だったさまざまなユースケースをシームレスに切り替えることができます。Android 13にはLEAudioの組み込みサポートが追加されているため、開発者は互換性のあるデバイスで新しい機能を無料で入手する必要があります。
- MIDI 2.0
- プライバシーとセキュリティ
  - 互換性フレームワークの変更を有効にします。 
   - DYNAMIC_RECEIVER_EXPLICIT_EXPORT_REQUIRED
   - >次のコードスニペットに示すように、アプリの各ブロードキャストレシーバーで、他のアプリがブロードキャストを送信できるかどうかを明示的に示します。
- [フォトピッカー](https://developer.android.com/about/versions/13/features/photopicker)
  - >注：フォトピッカーは、ユーザーの写真やビデオにアクセスするための推奨される方法になりました。
- 近くのWi-Fiデバイスの新しいランタイム権限
  - [ランタイム権限](https://developer.android.com/guide/topics/permissions/overview#runtime)
   - NEARBY_DEVICES
  - https://developer.android.com/about/versions/13/features/nearby-wifi-devices-permission 


# 動作の変更：Android13以降を対象とするアプリ

- 通知許可はフォアグラウンドサービスの外観に影響します
- 近くのWi-Fiデバイスの新しいランタイム権限
- インテントフィルターは、一致しないインテントをブロックします
- バッテリーリソースの使用率
