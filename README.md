# Show And Tell
### Overview
Blind people are often challenged in daily life, and when designing media we often don't accomodate them.
This is a proof-of-concept app that uses tensorflow to detect and categorize things through the phones camera and then uses Text-To-Speech to describe what is seen.

This has many advantages for blind people, just imagine getting a postcard or a leaflet with an image and some text. There are currently solutions that involve actual humans to help in situations like these ([Be My Eyes](https://play.google.com/store/apps/details?id=com.bemyeyes.bemyeyes&hl=de)) but with technology that enables cars to drive themselves this should be a easy problem.

### Roadmap
[ ] Make TTS act once button/screen is pressed
[ ] Make TTS try to read text ([Text Recognition API](https://developers.google.com/vision/android/text-overview))
[ ] Publish on Appstore

This mobile application was inspired by and built on top of this [Tensorflow Example](https://github.com/tensorflow/examples/tree/master/lite/examples/object_detection/android):
> This is a camera app that continuously detects the objects (bounding boxes and classes) in the frames seen by your device's back camera,  using a quantized [MobileNet SSD](https://github.com/tensorflow/models/tree/master/research/object_detection) model trained on the [COCO dataset](http://cocodataset.org/).
