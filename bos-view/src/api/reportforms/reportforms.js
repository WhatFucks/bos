import request from '@/utils/request'
export function echartsList(data) {
  return request({
    url: '/reportforms/reportformsList',
    method: 'post',
    data: data
  })
}

export function echartsSmall(data) {
  return request({
    url: '/smallpart/selectSmallpart',
    method: 'post',
    data: data
  })
}
// export function echartsList(data) {
//   return request({
//     url: '/reportforms/reportformsList',
//     method: 'post',
//     data: data
//   })
// }
